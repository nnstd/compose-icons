package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CertificateOutline: ImageVector
    get() {
        if (_CertificateOutline != null) {
            return _CertificateOutline!!
        }
        _CertificateOutline = ImageVector.Builder(
            name = "CertificateOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 21f)
                lineTo(15f, 20f)
                lineTo(17f, 21f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                moveTo(17f, 9f)
                verticalLineTo(7f)
                lineTo(15f, 8f)
                lineTo(13f, 7f)
                verticalLineTo(9f)
                lineTo(11f, 10f)
                lineTo(13f, 11f)
                verticalLineTo(13f)
                lineTo(15f, 12f)
                lineTo(17f, 13f)
                verticalLineTo(11f)
                lineTo(19f, 10f)
                moveTo(20f, 3f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 15f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 3f)
                moveTo(11f, 8f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                moveTo(9f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                moveTo(11f, 14f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _CertificateOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CertificateOutline: ImageVector? = null
