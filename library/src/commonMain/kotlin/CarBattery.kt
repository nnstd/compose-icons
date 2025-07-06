package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarBattery: ImageVector
    get() {
        if (_CarBattery != null) {
            return _CarBattery!!
        }
        _CarBattery = ImageVector.Builder(
            name = "CarBattery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(1f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                moveTo(3f, 8f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                moveTo(15f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                moveTo(5f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _CarBattery!!
    }

@Suppress("ObjectPropertyName")
private var _CarBattery: ImageVector? = null
