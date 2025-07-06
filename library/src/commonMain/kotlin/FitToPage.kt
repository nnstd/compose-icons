package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FitToPage: ImageVector
    get() {
        if (_FitToPage != null) {
            return _FitToPage!!
        }
        _FitToPage = ImageVector.Builder(
            name = "FitToPage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.89f, 2f, 2f, 2.89f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.89f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.89f, 21.11f, 2f, 20f, 2f)
                moveTo(12f, 4f)
                lineTo(15f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                moveTo(7f, 15f)
                lineTo(4f, 12f)
                lineTo(7f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                moveTo(12f, 20f)
                lineTo(9f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                moveTo(17f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                lineTo(20f, 12f)
            }
        }.build()

        return _FitToPage!!
    }

@Suppress("ObjectPropertyName")
private var _FitToPage: ImageVector? = null
