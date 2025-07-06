package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CircleOpacity: ImageVector
    get() {
        if (_CircleOpacity != null) {
            return _CircleOpacity!!
        }
        _CircleOpacity = ImageVector.Builder(
            name = "CircleOpacity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                moveTo(18f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                moveTo(18f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                moveTo(16f, 2.84f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                curveTo(17.37f, 3.54f, 16.71f, 3.15f, 16f, 2.84f)
                moveTo(18f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                curveTo(19.42f, 5.25f, 18.75f, 4.58f, 18f, 4f)
                moveTo(20f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(21.16f)
                curveTo(20.85f, 7.29f, 20.46f, 6.63f, 20f, 6f)
                moveTo(22f, 12f)
                curveTo(22f, 11.32f, 21.93f, 10.65f, 21.8f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                moveTo(16f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                moveTo(16f, 16f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                moveTo(18f, 18f)
                horizontalLineTo(20f)
                lineTo(20f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                moveTo(16f, 20f)
                horizontalLineTo(18f)
                lineTo(18f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                moveTo(14f, 21.8f)
                curveTo(14.7f, 21.66f, 15.36f, 21.44f, 16f, 21.16f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(21.8f)
                moveTo(18f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                moveTo(16f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                moveTo(20f, 16f)
                horizontalLineTo(21.16f)
                curveTo(21.44f, 15.36f, 21.66f, 14.7f, 21.8f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                moveTo(16f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                moveTo(12f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(2.2f)
                curveTo(13.35f, 2.07f, 12.69f, 2f, 12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                moveTo(14f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _CircleOpacity!!
    }

@Suppress("ObjectPropertyName")
private var _CircleOpacity: ImageVector? = null
