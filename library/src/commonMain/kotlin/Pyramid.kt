package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pyramid: ImageVector
    get() {
        if (_Pyramid != null) {
            return _Pyramid!!
        }
        _Pyramid = ImageVector.Builder(
            name = "Pyramid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.85f, 16.96f)
                horizontalLineTo(21.85f)
                lineTo(12.85f, 2.47f)
                curveTo(12.65f, 2.16f, 12.33f, 2f, 12f, 2f)
                reflectiveCurveTo(11.35f, 2.16f, 11.15f, 2.47f)
                lineTo(2.15f, 16.96f)
                horizontalLineTo(2.15f)
                curveTo(1.84f, 17.45f, 2f, 18.18f, 2.64f, 18.43f)
                lineTo(11.64f, 21.93f)
                curveTo(11.75f, 22f, 11.88f, 22f, 12f, 22f)
                reflectiveCurveTo(12.25f, 22f, 12.36f, 21.93f)
                lineTo(21.36f, 18.43f)
                curveTo(22f, 18.18f, 22.16f, 17.45f, 21.85f, 16.96f)
                moveTo(11f, 6.5f)
                verticalLineTo(13.32f)
                lineTo(5.42f, 15.5f)
                lineTo(11f, 6.5f)
                moveTo(12f, 19.93f)
                lineTo(5.76f, 17.5f)
                lineTo(12f, 15.07f)
                lineTo(18.24f, 17.5f)
                lineTo(12f, 19.93f)
                moveTo(13f, 13.32f)
                verticalLineTo(6.5f)
                lineTo(18.58f, 15.5f)
                lineTo(13f, 13.32f)
                close()
            }
        }.build()

        return _Pyramid!!
    }

@Suppress("ObjectPropertyName")
private var _Pyramid: ImageVector? = null
