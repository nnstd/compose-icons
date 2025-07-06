package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardRefreshOutline: ImageVector
    get() {
        if (_CreditCardRefreshOutline != null) {
            return _CreditCardRefreshOutline!!
        }
        _CreditCardRefreshOutline = ImageVector.Builder(
            name = "CreditCardRefreshOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(11.68f)
                curveTo(11.57f, 19.5f, 11.5f, 19f, 11.5f, 18.5f)
                curveTo(11.5f, 18.33f, 11.5f, 18.17f, 11.53f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(12.32f)
                curveTo(20.74f, 12.56f, 21.41f, 12.93f, 22f, 13.4f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                moveTo(20f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                moveTo(20.83f, 15.67f)
                lineTo(22f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18f)
                lineTo(19.77f, 16.73f)
                curveTo(19.32f, 16.28f, 18.69f, 16f, 18f, 16f)
                curveTo(16.62f, 16f, 15.5f, 17.12f, 15.5f, 18.5f)
                reflectiveCurveTo(16.62f, 21f, 18f, 21f)
                curveTo(18.82f, 21f, 19.54f, 20.61f, 20f, 20f)
                horizontalLineTo(21.71f)
                curveTo(21.12f, 21.47f, 19.68f, 22.5f, 18f, 22.5f)
                curveTo(15.79f, 22.5f, 14f, 20.71f, 14f, 18.5f)
                reflectiveCurveTo(15.79f, 14.5f, 18f, 14.5f)
                curveTo(19.11f, 14.5f, 20.11f, 14.95f, 20.83f, 15.67f)
                close()
            }
        }.build()

        return _CreditCardRefreshOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardRefreshOutline: ImageVector? = null
