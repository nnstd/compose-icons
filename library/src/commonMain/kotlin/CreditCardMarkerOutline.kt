package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreditCardMarkerOutline: ImageVector
    get() {
        if (_CreditCardMarkerOutline != null) {
            return _CreditCardMarkerOutline!!
        }
        _CreditCardMarkerOutline = ImageVector.Builder(
            name = "CreditCardMarkerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(14.3f)
                curveTo(15.3f, 10.8f, 16.8f, 10f, 18.5f, 10f)
                curveTo(19.8f, 10f, 21f, 10.5f, 22f, 11.3f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(14.6f)
                curveTo(14.2f, 19.4f, 13.8f, 18.7f, 13.5f, 18f)
                moveTo(4f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                moveTo(18.5f, 12f)
                curveTo(16.6f, 12f, 15f, 13.6f, 15f, 15.5f)
                curveTo(15f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                curveTo(18.5f, 22f, 22f, 18.1f, 22f, 15.5f)
                curveTo(22f, 13.6f, 20.4f, 12f, 18.5f, 12f)
                moveTo(18.5f, 16.8f)
                curveTo(17.8f, 16.8f, 17.3f, 16.2f, 17.3f, 15.6f)
                curveTo(17.3f, 14.9f, 17.9f, 14.4f, 18.5f, 14.4f)
                curveTo(19.1f, 14.4f, 19.7f, 15f, 19.7f, 15.6f)
                curveTo(19.8f, 16.2f, 19.2f, 16.8f, 18.5f, 16.8f)
                close()
            }
        }.build()

        return _CreditCardMarkerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCardMarkerOutline: ImageVector? = null
