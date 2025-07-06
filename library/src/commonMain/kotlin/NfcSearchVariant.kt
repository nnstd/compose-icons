package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NfcSearchVariant: ImageVector
    get() {
        if (_NfcSearchVariant != null) {
            return _NfcSearchVariant!!
        }
        _NfcSearchVariant = ImageVector.Builder(
            name = "NfcSearchVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 12f)
                curveTo(19f, 12f, 21f, 14f, 21f, 16.5f)
                curveTo(21f, 17.38f, 20.76f, 18.21f, 20.32f, 18.9f)
                lineTo(23.4f, 22f)
                lineTo(22f, 23.39f)
                lineTo(18.89f, 20.32f)
                curveTo(18.2f, 20.75f, 17.38f, 21f, 16.5f, 21f)
                curveTo(14f, 21f, 12f, 19f, 12f, 16.5f)
                curveTo(12f, 14f, 14f, 12f, 16.5f, 12f)
                moveTo(16.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 19f)
                curveTo(17.89f, 19f, 19f, 17.88f, 19f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 14f)
                moveTo(18f, 6f)
                verticalLineTo(10.18f)
                curveTo(17.33f, 10f, 16.66f, 9.97f, 16f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(10.28f)
                lineTo(13.53f, 10.72f)
                curveTo(12.34f, 11.33f, 11.35f, 12.3f, 10.72f, 13.53f)
                curveTo(10.28f, 13.17f, 10f, 12.62f, 10f, 12f)
                curveTo(10f, 11.26f, 10.41f, 10.62f, 11f, 10.28f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 6f)
                horizontalLineTo(18f)
                moveTo(6f, 18f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                lineTo(10f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                curveTo(9.96f, 16.68f, 10f, 17.35f, 10.17f, 18f)
                horizontalLineTo(6f)
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                curveTo(11.53f, 20.8f, 12.21f, 21.5f, 13.03f, 22f)
                horizontalLineTo(4f)
                curveTo(2.89f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(13.04f)
                curveTo(21.5f, 12.24f, 20.82f, 11.54f, 20f, 11f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _NfcSearchVariant!!
    }

@Suppress("ObjectPropertyName")
private var _NfcSearchVariant: ImageVector? = null
