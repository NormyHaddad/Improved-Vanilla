package net.garunix.garunixpansion.entity.custom;

/*public class RedCardinalEntity extends ParrotEntity implements GeoEntity {
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    public RedCardinalEntity(EntityType<? extends ParrotEntity> entityType, World world) {
        super(entityType, world);
        this.moveControl = new FlightMoveControl(this, 20, false);
        this.setPathfindingPenalty(PathNodeType.DANGER_FIRE, -1.0f);
        this.setPathfindingPenalty(PathNodeType.DAMAGE_FIRE, -1.0f);
    }
    public static DefaultAttributeContainer.Builder setAttributes() {
        return AnimalEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 8.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f)
                .add(EntityAttributes.GENERIC_FLYING_SPEED, 0.6f);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new EscapeDangerGoal(this, 1.25));
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new FlyOntoTreeGoal(this, 1.0));
        this.goalSelector.add(1, new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 0.75f, 0.5f));
        this.goalSelector.add(2, new LookAroundGoal(this));
    }

    @Override
    public void tickMovement() {}

    @Override
    public void setNearbySongPlaying(BlockPos songPosition, boolean playing) {}

    //@Override
    //public static boolean imitateNearbyMob(World world, Entity parrot) { return false; }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) { return null; }

    @Override
    public EntityView method_48926() {
        return null;
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        if (tAnimationState.isMoving()) {
            tAnimationState.getController().setAnimation(RawAnimation.begin().then(
                    "animation.red_cardinal.fly", Animation.LoopType.LOOP));
        }
        tAnimationState.getController().setAnimation(RawAnimation.begin().then(
                "animation.red_cardinal.preen", Animation.LoopType.PLAY_ONCE));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller",0, this::predicate));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    static class FlyOntoTreeGoal extends FlyGoal {
        public FlyOntoTreeGoal(PathAwareEntity pathAwareEntity, double d) {
            super(pathAwareEntity, d);
        }

        @Override
        @Nullable
        protected Vec3d getWanderTarget() {
            Vec3d vec3d = null;
            if (this.mob.isTouchingWater()) {
                vec3d = FuzzyTargeting.find(this.mob, 15, 15);
            }
            if (this.mob.getRandom().nextFloat() >= this.probability) {
                vec3d = this.locateTree();
            }
            return vec3d == null ? super.getWanderTarget() : vec3d;
        }

        @Nullable
        private Vec3d locateTree() {
            BlockPos blockPos = this.mob.getBlockPos();
            BlockPos.Mutable mutable = new BlockPos.Mutable();
            BlockPos.Mutable mutable2 = new BlockPos.Mutable();
            Iterable<BlockPos> iterable = BlockPos.iterate(MathHelper.floor(this.mob.getX() - 3.0), MathHelper.floor(this.mob.getY() - 6.0), MathHelper.floor(this.mob.getZ() - 3.0), MathHelper.floor(this.mob.getX() + 3.0), MathHelper.floor(this.mob.getY() + 6.0), MathHelper.floor(this.mob.getZ() + 3.0));
            for (BlockPos blockPos2 : iterable) {
                BlockState blockState;
                boolean bl;
                if (blockPos.equals(blockPos2) || !(bl = (blockState = this.mob.getWorld().getBlockState(mutable2.set((Vec3i)blockPos2, Direction.DOWN))).getBlock() instanceof LeavesBlock || blockState.isIn(BlockTags.LOGS)) || !this.mob.getWorld().isAir(blockPos2) || !this.mob.getWorld().isAir(mutable.set((Vec3i)blockPos2, Direction.UP))) continue;
                return Vec3d.ofBottomCenter(blockPos2);
            }
            return null;
        }
    }
}*/
