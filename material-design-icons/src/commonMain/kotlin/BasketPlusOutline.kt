package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BasketPlusOutline: ImageVector
    get() {
        if (_BasketPlusOutline != null) {
            return _BasketPlusOutline!!
        }
        _BasketPlusOutline = ImageVector.Builder(
            name = "BasketPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                moveTo(12f, 13f)
                curveTo(10.9f, 13f, 10f, 13.9f, 10f, 15f)
                reflectiveCurveTo(10.9f, 17f, 12f, 17f)
                reflectiveCurveTo(14f, 16.1f, 14f, 15f)
                reflectiveCurveTo(13.1f, 13f, 12f, 13f)
                moveTo(13.35f, 21f)
                horizontalLineTo(5.5f)
                curveTo(4.58f, 21f, 3.81f, 20.38f, 3.58f, 19.54f)
                lineTo(1.04f, 10.27f)
                curveTo(1f, 10.18f, 1f, 10.09f, 1f, 10f)
                curveTo(1f, 9.45f, 1.45f, 9f, 2f, 9f)
                horizontalLineTo(6.79f)
                lineTo(11.17f, 2.45f)
                curveTo(11.36f, 2.16f, 11.68f, 2f, 12f, 2f)
                reflectiveCurveTo(12.64f, 2.16f, 12.83f, 2.44f)
                lineTo(17.21f, 9f)
                horizontalLineTo(22f)
                curveTo(22.55f, 9f, 23f, 9.45f, 23f, 10f)
                lineTo(22.97f, 10.27f)
                lineTo(22f, 13.81f)
                curveTo(21.43f, 13.5f, 20.79f, 13.24f, 20.12f, 13.11f)
                lineTo(20.7f, 11f)
                horizontalLineTo(3.31f)
                lineTo(5.5f, 19f)
                horizontalLineTo(13f)
                curveTo(13f, 19.7f, 13.13f, 20.37f, 13.35f, 21f)
                moveTo(9.2f, 9f)
                horizontalLineTo(14.8f)
                lineTo(12f, 4.8f)
                lineTo(9.2f, 9f)
                close()
            }
        }.build()

        return _BasketPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BasketPlusOutline: ImageVector? = null
