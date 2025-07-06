package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FitToPageOutline: ImageVector
    get() {
        if (_FitToPageOutline != null) {
            return _FitToPageOutline!!
        }
        _FitToPageOutline = ImageVector.Builder(
            name = "FitToPageOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.89f, 2f, 2f, 2.89f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.89f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.11f, 22f, 22f, 21.11f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.89f, 21.11f, 2f, 20f, 2f)
                moveTo(20f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                moveTo(13f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                lineTo(12f, 5f)
                lineTo(15f, 8f)
                moveTo(16f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                lineTo(19f, 12f)
                moveTo(10f, 13f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                lineTo(5f, 12f)
                lineTo(8f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                moveTo(15f, 16f)
                lineTo(12f, 19f)
                lineTo(9f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
            }
        }.build()

        return _FitToPageOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FitToPageOutline: ImageVector? = null
