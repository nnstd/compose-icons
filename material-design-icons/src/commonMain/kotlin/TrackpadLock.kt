package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrackpadLock: ImageVector
    get() {
        if (_TrackpadLock != null) {
            return _TrackpadLock!!
        }
        _TrackpadLock = ImageVector.Builder(
            name = "TrackpadLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 1f)
                curveTo(1.89f, 1f, 1f, 1.89f, 1f, 3f)
                verticalLineTo(17f)
                curveTo(1f, 18.11f, 1.89f, 19f, 3f, 19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(16.68f)
                curveTo(17.5f, 12.35f, 18.47f, 12f, 19.5f, 12f)
                curveTo(20f, 12f, 20.5f, 12.09f, 21f, 12.26f)
                verticalLineTo(3f)
                curveTo(21f, 1.89f, 20.11f, 1f, 19f, 1f)
                horizontalLineTo(3f)
                moveTo(3f, 3f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(3f, 13f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                moveTo(19.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 16.5f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 18f)
                verticalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 23f)
                horizontalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 22f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                verticalLineTo(16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 14f)
                moveTo(19.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 16.5f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 15f)
                close()
            }
        }.build()

        return _TrackpadLock!!
    }

@Suppress("ObjectPropertyName")
private var _TrackpadLock: ImageVector? = null
