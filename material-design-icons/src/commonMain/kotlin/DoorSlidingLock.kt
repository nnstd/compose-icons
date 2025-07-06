package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DoorSlidingLock: ImageVector
    get() {
        if (_DoorSlidingLock != null) {
            return _DoorSlidingLock!!
        }
        _DoorSlidingLock = ImageVector.Builder(
            name = "DoorSlidingLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 17f)
                verticalLineTo(15.5f)
                curveTo(21.8f, 14.1f, 20.4f, 13f, 19f, 13f)
                reflectiveCurveTo(16.2f, 14.1f, 16.2f, 15.5f)
                verticalLineTo(17f)
                curveTo(15.6f, 17f, 15f, 17.6f, 15f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(15f, 22.4f, 15.6f, 23f, 16.2f, 23f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 23f, 23f, 22.4f, 23f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(23f, 17.6f, 22.4f, 17f, 21.8f, 17f)
                moveTo(20.5f, 17f)
                horizontalLineTo(17.5f)
                verticalLineTo(15.5f)
                curveTo(17.5f, 14.7f, 18.2f, 14.2f, 19f, 14.2f)
                reflectiveCurveTo(20.5f, 14.7f, 20.5f, 15.5f)
                verticalLineTo(17f)
                moveTo(13f, 11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                moveTo(9f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                moveTo(13f, 19f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(11.44f)
                curveTo(17.61f, 11.17f, 18.29f, 11f, 19f, 11f)
                verticalLineTo(5f)
                curveTo(19f, 3.9f, 18.1f, 3f, 17f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                moveTo(10f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _DoorSlidingLock!!
    }

@Suppress("ObjectPropertyName")
private var _DoorSlidingLock: ImageVector? = null
