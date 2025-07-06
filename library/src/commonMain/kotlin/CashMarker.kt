package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CashMarker: ImageVector
    get() {
        if (_CashMarker != null) {
            return _CashMarker!!
        }
        _CashMarker = ImageVector.Builder(
            name = "CashMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 16.8f)
                curveTo(17.8f, 16.8f, 17.3f, 16.2f, 17.3f, 15.6f)
                curveTo(17.3f, 14.9f, 17.9f, 14.4f, 18.5f, 14.4f)
                curveTo(19.1f, 14.4f, 19.7f, 15f, 19.7f, 15.6f)
                curveTo(19.8f, 16.2f, 19.2f, 16.8f, 18.5f, 16.8f)
                moveTo(18.5f, 12f)
                curveTo(16.6f, 12f, 15f, 13.6f, 15f, 15.5f)
                curveTo(15f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                curveTo(18.5f, 22f, 22f, 18.1f, 22f, 15.5f)
                curveTo(22f, 13.6f, 20.4f, 12f, 18.5f, 12f)
                moveTo(14.9f, 11.3f)
                curveTo(14.6f, 10f, 13.4f, 9f, 12f, 9f)
                curveTo(10.3f, 9f, 9f, 10.3f, 9f, 12f)
                curveTo(9f, 13.7f, 10.3f, 15f, 12f, 15f)
                curveTo(12.4f, 15f, 12.7f, 14.9f, 13f, 14.8f)
                curveTo(13.2f, 13.4f, 13.9f, 12.2f, 14.9f, 11.3f)
                moveTo(13f, 16f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 14f)
                verticalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 8f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10f)
                curveTo(19f, 10f, 20f, 10f, 21f, 10.6f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(13.5f)
                curveTo(13.3f, 17.3f, 13.1f, 16.7f, 13f, 16f)
                close()
            }
        }.build()

        return _CashMarker!!
    }

@Suppress("ObjectPropertyName")
private var _CashMarker: ImageVector? = null
