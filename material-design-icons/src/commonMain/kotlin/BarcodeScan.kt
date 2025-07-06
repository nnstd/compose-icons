package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BarcodeScan: ImageVector
    get() {
        if (_BarcodeScan != null) {
            return _BarcodeScan!!
        }
        _BarcodeScan = ImageVector.Builder(
            name = "BarcodeScan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                moveTo(7f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                moveTo(9f, 6f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                moveTo(13f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                moveTo(16f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                moveTo(19f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(6f)
                moveTo(2f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                moveTo(22f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                horizontalLineTo(22f)
                moveTo(2f, 16f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                moveTo(22f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(24f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 22f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _BarcodeScan!!
    }

@Suppress("ObjectPropertyName")
private var _BarcodeScan: ImageVector? = null
