package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Handshake: ImageVector
    get() {
        if (_Handshake != null) {
            return _Handshake!!
        }
        _Handshake = ImageVector.Builder(
            name = "Handshake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 6f)
                horizontalLineTo(14f)
                lineTo(17.29f, 2.7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.71f, 2.7f)
                lineTo(21.29f, 5.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.29f, 6.7f)
                lineTo(19f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 11f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6f)
                moveTo(5f, 11f)
                verticalLineTo(15f)
                lineTo(2.71f, 17.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.71f, 18.7f)
                lineTo(5.29f, 21.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.71f, 21.29f)
                lineTo(11f, 17f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 14f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Handshake!!
    }

@Suppress("ObjectPropertyName")
private var _Handshake: ImageVector? = null
