package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileCertificate: ImageVector
    get() {
        if (_FileCertificate != null) {
            return _FileCertificate!!
        }
        _FileCertificate = ImageVector.Builder(
            name = "FileCertificate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 4f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 20f)
                horizontalLineTo(10f)
                verticalLineTo(23f)
                lineTo(12f, 22f)
                lineTo(14f, 23f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18f)
                verticalLineTo(7f)
                moveTo(14f, 15f)
                verticalLineTo(17f)
                lineTo(12f, 16f)
                lineTo(10f, 17f)
                verticalLineTo(15f)
                lineTo(8f, 14f)
                lineTo(10f, 13f)
                verticalLineTo(11f)
                lineTo(12f, 12f)
                lineTo(14f, 11f)
                verticalLineTo(13f)
                lineTo(16f, 14f)
                moveTo(13f, 8f)
                verticalLineTo(3.5f)
                lineTo(17.5f, 8f)
                close()
            }
        }.build()

        return _FileCertificate!!
    }

@Suppress("ObjectPropertyName")
private var _FileCertificate: ImageVector? = null
