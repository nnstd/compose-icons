package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileCertificateOutline: ImageVector
    get() {
        if (_FileCertificateOutline != null) {
            return _FileCertificateOutline!!
        }
        _FileCertificateOutline = ImageVector.Builder(
            name = "FileCertificateOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 13f)
                verticalLineTo(11f)
                lineTo(12f, 12f)
                lineTo(10f, 11f)
                verticalLineTo(13f)
                lineTo(8f, 14f)
                lineTo(10f, 15f)
                verticalLineTo(17f)
                lineTo(12f, 16f)
                lineTo(14f, 17f)
                verticalLineTo(15f)
                lineTo(16f, 14f)
                moveTo(14f, 2f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 4f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18f)
                verticalLineTo(7f)
                moveTo(14f, 13f)
                verticalLineTo(11f)
                lineTo(12f, 12f)
                lineTo(10f, 11f)
                verticalLineTo(13f)
                lineTo(8f, 14f)
                lineTo(10f, 15f)
                verticalLineTo(17f)
                lineTo(12f, 16f)
                lineTo(14f, 17f)
                verticalLineTo(15f)
                lineTo(16f, 14f)
                moveTo(10f, 23f)
                lineTo(12f, 22f)
                lineTo(14f, 23f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                moveTo(14f, 13f)
                verticalLineTo(11f)
                lineTo(12f, 12f)
                lineTo(10f, 11f)
                verticalLineTo(13f)
                lineTo(8f, 14f)
                lineTo(10f, 15f)
                verticalLineTo(17f)
                lineTo(12f, 16f)
                lineTo(14f, 17f)
                verticalLineTo(15f)
                lineTo(16f, 14f)
                close()
            }
        }.build()

        return _FileCertificateOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileCertificateOutline: ImageVector? = null
