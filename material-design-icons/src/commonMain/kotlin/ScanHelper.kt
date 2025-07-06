package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScanHelper: ImageVector
    get() {
        if (_ScanHelper != null) {
            return _ScanHelper!!
        }
        _ScanHelper = ImageVector.Builder(
            name = "ScanHelper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(2f)
                moveTo(24f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 24f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(24f)
                verticalLineTo(22f)
                moveTo(2f, 24f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(24f)
                horizontalLineTo(2f)
                moveTo(22f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                verticalLineTo(0f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _ScanHelper!!
    }

@Suppress("ObjectPropertyName")
private var _ScanHelper: ImageVector? = null
