package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignatureImage: ImageVector
    get() {
        if (_SignatureImage != null) {
            return _SignatureImage!!
        }
        _SignatureImage = ImageVector.Builder(
            name = "SignatureImage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                moveTo(6.2f, 17.3f)
                lineTo(4.8f, 15.9f)
                lineTo(6.2f, 14.5f)
                lineTo(5.5f, 13.8f)
                lineTo(4.1f, 15.2f)
                lineTo(2.7f, 13.8f)
                lineTo(2f, 14.5f)
                lineTo(3.4f, 15.9f)
                lineTo(2f, 17.3f)
                lineTo(2.7f, 18f)
                lineTo(4.1f, 16.6f)
                lineTo(5.5f, 18f)
                lineTo(6.2f, 17.3f)
                moveTo(20f, 5f)
                horizontalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 7f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 18f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 5f)
                moveTo(10f, 16f)
                lineTo(12.6f, 12.7f)
                lineTo(14.4f, 14.9f)
                lineTo(16.8f, 11.6f)
                lineTo(20f, 16f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _SignatureImage!!
    }

@Suppress("ObjectPropertyName")
private var _SignatureImage: ImageVector? = null
