package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pretzel: ImageVector
    get() {
        if (_Pretzel != null) {
            return _Pretzel!!
        }
        _Pretzel = ImageVector.Builder(
            name = "Pretzel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.15f, 15.84f)
                curveTo(3.81f, 14.27f, 3f, 12.23f, 3f, 10f)
                verticalLineTo(9.97f)
                curveTo(3f, 7.22f, 5.25f, 5f, 8f, 5f)
                curveTo(9.64f, 5f, 11.09f, 5.79f, 12f, 7f)
                curveTo(12.91f, 5.79f, 14.37f, 5f, 16f, 5f)
                curveTo(18.76f, 5f, 21f, 7.24f, 21f, 10f)
                curveTo(21f, 12.23f, 20.19f, 14.27f, 18.85f, 15.84f)
                lineTo(20.21f, 17.2f)
                lineTo(18.79f, 18.61f)
                lineTo(17.39f, 17.21f)
                curveTo(15.89f, 18.33f, 14f, 19f, 12f, 19f)
                curveTo(10f, 19f, 8.11f, 18.33f, 6.61f, 17.21f)
                lineTo(5.21f, 18.61f)
                lineTo(3.79f, 17.2f)
                lineTo(5.15f, 15.84f)
                moveTo(15.96f, 15.77f)
                lineTo(12f, 11.82f)
                lineTo(8.04f, 15.77f)
                curveTo(9.17f, 16.55f, 10.53f, 17f, 12f, 17f)
                curveTo(13.47f, 17f, 14.83f, 16.55f, 15.96f, 15.77f)
                moveTo(11f, 10f)
                curveTo(11f, 8.34f, 9.65f, 7f, 8f, 7f)
                curveTo(6.34f, 7f, 5f, 8.34f, 5f, 10f)
                curveTo(5f, 11.68f, 5.59f, 13.21f, 6.57f, 14.42f)
                lineTo(11f, 10f)
                moveTo(17.43f, 14.42f)
                curveTo(18.41f, 13.21f, 19f, 11.68f, 19f, 10f)
                verticalLineTo(10f)
                curveTo(19f, 8.33f, 17.65f, 7f, 16f, 7f)
                curveTo(14.35f, 7f, 13f, 8.34f, 13f, 10f)
                lineTo(17.43f, 14.42f)
                close()
            }
        }.build()

        return _Pretzel!!
    }

@Suppress("ObjectPropertyName")
private var _Pretzel: ImageVector? = null
