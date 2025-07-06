package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookOffOutline: ImageVector
    get() {
        if (_BookOffOutline != null) {
            return _BookOffOutline!!
        }
        _BookOffOutline = ImageVector.Builder(
            name = "BookOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 14.8f)
                lineTo(4f, 16.8f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(18f)
                curveTo(18.24f, 2f, 18.47f, 2.04f, 18.68f, 2.12f)
                lineTo(16.8f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(7.8f)
                lineTo(10.79f, 10f)
                lineTo(10.5f, 9.75f)
                lineTo(8f, 12f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(14.8f)
                moveTo(22.89f, 3f)
                lineTo(20f, 5.89f)
                verticalLineTo(20f)
                curveTo(20f, 21.11f, 19.11f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(5.42f, 22f, 4.9f, 21.75f, 4.54f, 21.35f)
                lineTo(3.16f, 22.73f)
                lineTo(1.89f, 21.46f)
                lineTo(21.61f, 1.73f)
                lineTo(22.89f, 3f)
                moveTo(18f, 7.89f)
                lineTo(6f, 19.89f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(7.89f)
                close()
            }
        }.build()

        return _BookOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookOffOutline: ImageVector? = null
