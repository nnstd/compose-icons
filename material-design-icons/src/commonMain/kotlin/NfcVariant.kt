package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NfcVariant: ImageVector
    get() {
        if (_NfcVariant != null) {
            return _NfcVariant!!
        }
        _NfcVariant = ImageVector.Builder(
            name = "NfcVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8f)
                verticalLineTo(10.28f)
                curveTo(10.41f, 10.62f, 10f, 11.26f, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                curveTo(13.11f, 14f, 14f, 13.1f, 14f, 12f)
                curveTo(14f, 11.26f, 13.6f, 10.62f, 13f, 10.28f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                lineTo(6f, 6f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                moveTo(20f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.1f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.89f, 21.11f, 2f, 20f, 2f)
                close()
            }
        }.build()

        return _NfcVariant!!
    }

@Suppress("ObjectPropertyName")
private var _NfcVariant: ImageVector? = null
