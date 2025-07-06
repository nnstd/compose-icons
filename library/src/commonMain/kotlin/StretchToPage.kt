package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StretchToPage: ImageVector
    get() {
        if (_StretchToPage != null) {
            return _StretchToPage!!
        }
        _StretchToPage = ImageVector.Builder(
            name = "StretchToPage",
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
                moveTo(9f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                lineTo(6.29f, 16.29f)
                lineTo(7.83f, 14.75f)
                lineTo(9.25f, 16.17f)
                lineTo(7.71f, 17.71f)
                moveTo(7.83f, 9.25f)
                lineTo(6.29f, 7.71f)
                lineTo(5f, 9f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                lineTo(7.71f, 6.29f)
                lineTo(9.25f, 7.83f)
                moveTo(19f, 19f)
                horizontalLineTo(15f)
                lineTo(16.29f, 17.71f)
                lineTo(14.75f, 16.17f)
                lineTo(16.17f, 14.75f)
                lineTo(17.71f, 16.29f)
                lineTo(19f, 15f)
                moveTo(19f, 9f)
                lineTo(17.71f, 7.71f)
                lineTo(16.17f, 9.25f)
                lineTo(14.75f, 7.83f)
                lineTo(16.29f, 6.29f)
                lineTo(15f, 5f)
                horizontalLineTo(19f)
            }
        }.build()

        return _StretchToPage!!
    }

@Suppress("ObjectPropertyName")
private var _StretchToPage: ImageVector? = null
