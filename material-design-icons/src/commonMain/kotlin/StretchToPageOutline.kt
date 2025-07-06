package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StretchToPageOutline: ImageVector
    get() {
        if (_StretchToPageOutline != null) {
            return _StretchToPageOutline!!
        }
        _StretchToPageOutline = ImageVector.Builder(
            name = "StretchToPageOutline",
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
                moveTo(8.83f, 10.25f)
                lineTo(7.29f, 8.71f)
                lineTo(6f, 10f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                lineTo(8.71f, 7.29f)
                lineTo(10.25f, 8.83f)
                moveTo(13.75f, 8.83f)
                lineTo(15.29f, 7.29f)
                lineTo(14f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                lineTo(16.71f, 8.71f)
                lineTo(15.17f, 10.25f)
                moveTo(15.17f, 13.75f)
                lineTo(16.71f, 15.29f)
                lineTo(18f, 14f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                lineTo(15.29f, 16.71f)
                lineTo(13.75f, 15.17f)
                moveTo(10.25f, 15.17f)
                lineTo(8.71f, 16.71f)
                lineTo(10f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                lineTo(7.29f, 15.29f)
                lineTo(8.83f, 13.75f)
            }
        }.build()

        return _StretchToPageOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StretchToPageOutline: ImageVector? = null
