package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MouseBluetooth: ImageVector
    get() {
        if (_MouseBluetooth != null) {
            return _MouseBluetooth!!
        }
        _MouseBluetooth = ImageVector.Builder(
            name = "MouseBluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7f)
                horizontalLineTo(20.5f)
                lineTo(23.35f, 9.85f)
                lineTo(21.21f, 12f)
                lineTo(23.35f, 14.14f)
                lineTo(20.5f, 17f)
                horizontalLineTo(20f)
                verticalLineTo(13.21f)
                lineTo(17.71f, 15.5f)
                lineTo(17f, 14.79f)
                lineTo(19.79f, 12f)
                lineTo(17f, 9.21f)
                lineTo(17.71f, 8.5f)
                lineTo(20f, 10.79f)
                verticalLineTo(7f)
                moveTo(21f, 8.91f)
                verticalLineTo(10.79f)
                lineTo(21.94f, 9.85f)
                lineTo(21f, 8.91f)
                moveTo(21f, 13.21f)
                verticalLineTo(15.08f)
                lineTo(21.94f, 14.14f)
                lineTo(21f, 13.21f)
                moveTo(15f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(2.07f)
                curveTo(12.39f, 2.56f, 15f, 5.47f, 15f, 9f)
                moveTo(1f, 10f)
                verticalLineTo(9f)
                curveTo(1f, 5.47f, 3.61f, 2.56f, 7f, 2.07f)
                verticalLineTo(10f)
                horizontalLineTo(1f)
                moveTo(15f, 15f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 22f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 15f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _MouseBluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _MouseBluetooth: ImageVector? = null
