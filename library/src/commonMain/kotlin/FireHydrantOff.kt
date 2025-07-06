package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FireHydrantOff: ImageVector
    get() {
        if (_FireHydrantOff != null) {
            return _FireHydrantOff!!
        }
        _FireHydrantOff = ImageVector.Builder(
            name = "FireHydrantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(8f, 9.89f)
                verticalLineTo(20f)
                curveTo(6.9f, 20f, 6f, 20.9f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(18f, 20.9f, 17.11f, 20f, 16f, 20f)
                verticalLineTo(17.89f)
                lineTo(20.84f, 22.73f)
                moveTo(10.22f, 12.11f)
                lineTo(12.89f, 14.78f)
                curveTo(12.62f, 14.92f, 12.32f, 15f, 12f, 15f)
                curveTo(10.9f, 15f, 10f, 14.11f, 10f, 13f)
                curveTo(10f, 12.68f, 10.08f, 12.38f, 10.22f, 12.11f)
                moveTo(11.2f, 8f)
                lineTo(8.44f, 5.24f)
                curveTo(8.94f, 4.21f, 9.87f, 3.43f, 11f, 3.14f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                verticalLineTo(3.14f)
                curveTo(14.4f, 3.5f, 15.5f, 4.6f, 15.86f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(11.2f)
                moveTo(19f, 11f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(18.2f)
                lineTo(17f, 13.8f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                moveTo(5f, 15f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                moveTo(16f, 12.8f)
                lineTo(12.2f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(12.8f)
                close()
            }
        }.build()

        return _FireHydrantOff!!
    }

@Suppress("ObjectPropertyName")
private var _FireHydrantOff: ImageVector? = null
