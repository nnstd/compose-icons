package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WhistleOutline: ImageVector
    get() {
        if (_WhistleOutline != null) {
            return _WhistleOutline!!
        }
        _WhistleOutline = ImageVector.Builder(
            name = "WhistleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.76f, 3.7f)
                lineTo(2.14f, 4.88f)
                lineTo(4.43f, 8f)
                arcTo(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.35f, 7.28f)
                moveTo(11f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(11.29f)
                lineTo(13f, 12.71f)
                verticalLineTo(15.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.5f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(8.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15f, 15.5f)
                verticalLineTo(13.91f)
                lineTo(22f, 12f)
                verticalLineTo(9f)
                moveTo(16.24f, 3.7f)
                lineTo(13.85f, 7f)
                horizontalLineTo(16.32f)
                lineTo(17.86f, 4.88f)
                moveTo(9f, 2f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _WhistleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WhistleOutline: ImageVector? = null
