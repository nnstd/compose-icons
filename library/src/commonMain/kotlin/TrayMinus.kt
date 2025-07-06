package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrayMinus: ImageVector
    get() {
        if (_TrayMinus != null) {
            return _TrayMinus!!
        }
        _TrayMinus = ImageVector.Builder(
            name = "TrayMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                moveTo(2f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _TrayMinus!!
    }

@Suppress("ObjectPropertyName")
private var _TrayMinus: ImageVector? = null
