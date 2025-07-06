package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.JumpRope: ImageVector
    get() {
        if (_JumpRope != null) {
            return _JumpRope!!
        }
        _JumpRope = ImageVector.Builder(
            name = "JumpRope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4.5f)
                verticalLineTo(10.5f)
                curveTo(21f, 11.2f, 20.5f, 11.9f, 19.8f, 12f)
                verticalLineTo(17.3f)
                curveTo(19.8f, 18.6f, 19f, 21.1f, 16f, 21.1f)
                horizontalLineTo(14.5f)
                curveTo(14.9f, 20.7f, 15.3f, 20.2f, 15.5f, 19.6f)
                horizontalLineTo(16f)
                curveTo(18.1f, 19.6f, 18.2f, 17.7f, 18.2f, 17.4f)
                verticalLineTo(12f)
                curveTo(17.5f, 11.9f, 17f, 11.3f, 17f, 10.5f)
                verticalLineTo(4.5f)
                curveTo(17f, 3.7f, 17.7f, 3f, 18.5f, 3f)
                horizontalLineTo(19.5f)
                curveTo(20.3f, 3f, 21f, 3.7f, 21f, 4.5f)
                moveTo(14.8f, 18.2f)
                curveTo(14.8f, 19.7f, 13.6f, 21f, 12f, 21f)
                horizontalLineTo(8f)
                curveTo(5f, 21f, 4.2f, 18.5f, 4.2f, 17.2f)
                verticalLineTo(12f)
                curveTo(3.5f, 11.9f, 3f, 11.2f, 3f, 10.5f)
                verticalLineTo(4.5f)
                curveTo(3f, 3.7f, 3.7f, 3f, 4.5f, 3f)
                horizontalLineTo(5.5f)
                curveTo(6.3f, 3f, 7f, 3.7f, 7f, 4.5f)
                verticalLineTo(10.5f)
                curveTo(7f, 11.2f, 6.5f, 11.9f, 5.8f, 12f)
                verticalLineTo(17.3f)
                curveTo(5.8f, 17.7f, 5.9f, 19.5f, 8f, 19.5f)
                horizontalLineTo(9.6f)
                curveTo(9.4f, 19.1f, 9.3f, 18.7f, 9.3f, 18.3f)
                verticalLineTo(8.3f)
                curveTo(9.3f, 6.8f, 10.5f, 5.5f, 12.1f, 5.5f)
                reflectiveCurveTo(14.8f, 6.7f, 14.8f, 8.3f)
                moveTo(13.2f, 8.2f)
                curveTo(13.2f, 7.6f, 12.7f, 7f, 12f, 7f)
                reflectiveCurveTo(10.8f, 7.6f, 10.8f, 8.2f)
                verticalLineTo(18.2f)
                curveTo(10.8f, 18.9f, 11.4f, 19.4f, 12f, 19.4f)
                reflectiveCurveTo(13.2f, 18.8f, 13.2f, 18.2f)
                verticalLineTo(8.2f)
                close()
            }
        }.build()

        return _JumpRope!!
    }

@Suppress("ObjectPropertyName")
private var _JumpRope: ImageVector? = null
