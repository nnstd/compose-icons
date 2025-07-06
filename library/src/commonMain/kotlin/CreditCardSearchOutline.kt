package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardSearchOutline: ImageVector
    get() {
        if (_CreditCardSearchOutline != null) {
            return _CreditCardSearchOutline!!
        }
        _CreditCardSearchOutline = ImageVector.Builder(
            name = "CreditCardSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.03f, 12f)
                curveTo(11.28f, 11.61f, 11.57f, 11.24f, 11.9f, 10.9f)
                curveTo(14.44f, 8.37f, 18.56f, 8.37f, 21.1f, 10.9f)
                curveTo(21.45f, 11.26f, 21.74f, 11.65f, 22f, 12.06f)
                verticalLineTo(6f)
                curveTo(22f, 4.89f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(11.82f)
                curveTo(11.24f, 19.4f, 10.8f, 18.72f, 10.5f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(11.03f)
                moveTo(4f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                moveTo(20.31f, 17.9f)
                curveTo(20.75f, 17.21f, 21f, 16.38f, 21f, 15.5f)
                curveTo(21f, 13f, 19f, 11f, 16.5f, 11f)
                reflectiveCurveTo(12f, 13f, 12f, 15.5f)
                reflectiveCurveTo(14f, 20f, 16.5f, 20f)
                curveTo(17.37f, 20f, 18.19f, 19.75f, 18.88f, 19.32f)
                lineTo(22f, 22.39f)
                lineTo(23.39f, 21f)
                lineTo(20.31f, 17.9f)
                moveTo(16.5f, 18f)
                curveTo(15.12f, 18f, 14f, 16.88f, 14f, 15.5f)
                reflectiveCurveTo(15.12f, 13f, 16.5f, 13f)
                reflectiveCurveTo(19f, 14.12f, 19f, 15.5f)
                reflectiveCurveTo(17.88f, 18f, 16.5f, 18f)
                close()
            }
        }.build()

        return _CreditCardSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardSearchOutline: ImageVector? = null
