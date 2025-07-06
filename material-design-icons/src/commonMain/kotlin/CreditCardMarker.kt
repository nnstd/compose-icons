package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardMarker: ImageVector
    get() {
        if (_CreditCardMarker != null) {
            return _CreditCardMarker!!
        }
        _CreditCardMarker = ImageVector.Builder(
            name = "CreditCardMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 12f)
                curveTo(16.6f, 12f, 15f, 13.6f, 15f, 15.5f)
                curveTo(15f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                reflectiveCurveTo(22f, 18.1f, 22f, 15.5f)
                curveTo(22f, 13.6f, 20.4f, 12f, 18.5f, 12f)
                moveTo(18.5f, 16.8f)
                curveTo(17.8f, 16.8f, 17.3f, 16.2f, 17.3f, 15.6f)
                curveTo(17.3f, 14.9f, 17.9f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(19.7f, 15f, 19.7f, 15.6f)
                curveTo(19.8f, 16.2f, 19.2f, 16.8f, 18.5f, 16.8f)
                moveTo(14.55f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(20f)
                curveTo(21.11f, 4f, 22f, 4.89f, 22f, 6f)
                verticalLineTo(11.3f)
                curveTo(21.42f, 10.81f, 20.74f, 10.44f, 20f, 10.22f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(15.39f)
                curveTo(13.96f, 12f, 13f, 13.66f, 13f, 15.5f)
                curveTo(13f, 17f, 13.72f, 18.61f, 14.55f, 20f)
                close()
            }
        }.build()

        return _CreditCardMarker!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardMarker: ImageVector? = null
