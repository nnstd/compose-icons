package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarClutch: ImageVector
    get() {
        if (_CarClutch != null) {
            return _CarClutch!!
        }
        _CarClutch = ImageVector.Builder(
            name = "CarClutch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 18.84f)
                lineTo(14f, 20.7f)
                verticalLineTo(23f)
                lineTo(8f, 20f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                lineTo(14f, 1f)
                verticalLineTo(3.3f)
                lineTo(10f, 5.16f)
                verticalLineTo(18.84f)
                moveTo(19f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(5.41f)
                lineTo(12f, 6.8f)
                verticalLineTo(17.2f)
                lineTo(15f, 18.6f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _CarClutch!!
    }

@Suppress("ObjectPropertyName")
private var _CarClutch: ImageVector? = null
