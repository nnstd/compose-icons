package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CurrencyBtc: ImageVector
    get() {
        if (_CurrencyBtc != null) {
            return _CurrencyBtc!!
        }
        _CurrencyBtc = ImageVector.Builder(
            name = "CurrencyBtc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.06f, 11.57f)
                curveTo(17.65f, 10.88f, 18f, 10f, 18f, 9f)
                curveTo(18f, 7.14f, 16.73f, 5.57f, 15f, 5.13f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                curveTo(17.21f, 19f, 19f, 17.21f, 19f, 15f)
                curveTo(19f, 13.55f, 18.22f, 12.27f, 17.06f, 11.57f)
                moveTo(10f, 7f)
                horizontalLineTo(14f)
                curveTo(15.1f, 7f, 16f, 7.9f, 16f, 9f)
                reflectiveCurveTo(15.1f, 11f, 14f, 11f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                moveTo(15f, 17f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                curveTo(16.1f, 13f, 17f, 13.9f, 17f, 15f)
                reflectiveCurveTo(16.1f, 17f, 15f, 17f)
                close()
            }
        }.build()

        return _CurrencyBtc!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyBtc: ImageVector? = null
