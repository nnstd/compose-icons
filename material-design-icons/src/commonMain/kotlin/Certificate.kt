package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Certificate: ImageVector
    get() {
        if (_Certificate != null) {
            return _Certificate!!
        }
        _Certificate = ImageVector.Builder(
            name = "Certificate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                curveTo(2.89f, 3f, 2f, 3.89f, 2f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(22f)
                lineTo(15f, 19f)
                lineTo(18f, 22f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 15f)
                verticalLineTo(8f)
                lineTo(22f, 6f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                moveTo(12f, 5f)
                lineTo(15f, 7f)
                lineTo(18f, 5f)
                verticalLineTo(8.5f)
                lineTo(21f, 10f)
                lineTo(18f, 11.5f)
                verticalLineTo(15f)
                lineTo(15f, 13f)
                lineTo(12f, 15f)
                verticalLineTo(11.5f)
                lineTo(9f, 10f)
                lineTo(12f, 8.5f)
                verticalLineTo(5f)
                moveTo(4f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                moveTo(4f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                moveTo(4f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Certificate!!
    }

@Suppress("ObjectPropertyName")
private var _Certificate: ImageVector? = null
