package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NfcTap: ImageVector
    get() {
        if (_NfcTap != null) {
            return _NfcTap!!
        }
        _NfcTap = ImageVector.Builder(
            name = "NfcTap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                moveTo(4f, 4f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                lineTo(9f, 12f)
                lineTo(6f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 11f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                moveTo(20f, 20f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 18f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                lineTo(15f, 12f)
                lineTo(18f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 13f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                close()
            }
        }.build()

        return _NfcTap!!
    }

@Suppress("ObjectPropertyName")
private var _NfcTap: ImageVector? = null
