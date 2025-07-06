package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RollerbladeOff: ImageVector
    get() {
        if (_RollerbladeOff != null) {
            return _RollerbladeOff!!
        }
        _RollerbladeOff = ImageVector.Builder(
            name = "RollerbladeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(20.32f, 22.21f)
                curveTo(19.86f, 22.69f, 19.22f, 23f, 18.5f, 23f)
                curveTo(17.12f, 23f, 16f, 21.88f, 16f, 20.5f)
                curveTo(16f, 19.78f, 16.31f, 19.14f, 16.79f, 18.68f)
                lineTo(15.11f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(4.9f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(19.5f, 12.95f)
                curveTo(18.55f, 10.9f, 15.82f, 10.56f, 13.91f, 10.05f)
                curveTo(13.45f, 10.03f, 13f, 9.77f, 12.6f, 9.4f)
                lineTo(20f, 16.79f)
                curveTo(20f, 15.45f, 20.06f, 13.76f, 19.5f, 12.95f)
                moveTo(9.2f, 6f)
                lineTo(10.2f, 7f)
                horizontalLineTo(11.5f)
                verticalLineTo(6f)
                horizontalLineTo(9.2f)
                moveTo(12.56f, 9.36f)
                curveTo(12.18f, 9f, 11.9f, 8.5f, 11.82f, 8f)
                horizontalLineTo(11.2f)
                lineTo(12.56f, 9.36f)
                moveTo(11.5f, 18f)
                curveTo(10.12f, 18f, 9f, 19.12f, 9f, 20.5f)
                curveTo(9f, 21.88f, 10.12f, 23f, 11.5f, 23f)
                reflectiveCurveTo(14f, 21.88f, 14f, 20.5f)
                curveTo(14f, 19.12f, 12.88f, 18f, 11.5f, 18f)
                moveTo(9f, 5f)
                horizontalLineTo(11.5f)
                verticalLineTo(2f)
                horizontalLineTo(5.2f)
                lineTo(8.5f, 5.32f)
                curveTo(8.59f, 5.13f, 8.77f, 5f, 9f, 5f)
                moveTo(4.5f, 18f)
                curveTo(3.12f, 18f, 2f, 19.12f, 2f, 20.5f)
                curveTo(2f, 21.88f, 3.12f, 23f, 4.5f, 23f)
                reflectiveCurveTo(7f, 21.88f, 7f, 20.5f)
                curveTo(7f, 19.12f, 5.88f, 18f, 4.5f, 18f)
                close()
            }
        }.build()

        return _RollerbladeOff!!
    }

@Suppress("ObjectPropertyName")
private var _RollerbladeOff: ImageVector? = null
