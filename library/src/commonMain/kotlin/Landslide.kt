package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Landslide: ImageVector
    get() {
        if (_Landslide != null) {
            return _Landslide!!
        }
        _Landslide = ImageVector.Builder(
            name = "Landslide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.47f, 13.79f)
                lineTo(12.89f, 12.76f)
                lineTo(6f, 15.05f)
                lineTo(2f, 13.5f)
                verticalLineTo(15.61f)
                lineTo(6f, 16.95f)
                lineTo(15.47f, 13.79f)
                moveTo(10.57f, 11.42f)
                lineTo(8f, 8f)
                horizontalLineTo(2f)
                verticalLineTo(11.61f)
                lineTo(6f, 12.95f)
                lineTo(10.57f, 11.42f)
                moveTo(6f, 19.05f)
                lineTo(2f, 17.72f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                lineTo(17.03f, 15.38f)
                lineTo(6f, 19.05f)
                moveTo(17f, 6f)
                verticalLineTo(1f)
                lineTo(12f, 0f)
                lineTo(9f, 2f)
                verticalLineTo(6f)
                lineTo(12f, 8f)
                lineTo(17f, 6f)
                moveTo(18.5f, 7f)
                lineTo(16f, 9f)
                verticalLineTo(12f)
                lineTo(18.5f, 14f)
                lineTo(23f, 12f)
                verticalLineTo(8f)
                lineTo(18.5f, 7f)
                close()
            }
        }.build()

        return _Landslide!!
    }

@Suppress("ObjectPropertyName")
private var _Landslide: ImageVector? = null
