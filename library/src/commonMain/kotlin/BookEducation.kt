package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookEducation: ImageVector
    get() {
        if (_BookEducation != null) {
            return _BookEducation!!
        }
        _BookEducation = ImageVector.Builder(
            name = "BookEducation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.82f, 17f)
                lineTo(13f, 19.28f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.11f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                lineTo(9.5f, 7.5f)
                lineTo(12f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                curveTo(19.1f, 2f, 20f, 2.89f, 20f, 4f)
                verticalLineTo(12.54f)
                lineTo(18.5f, 11.72f)
                lineTo(8.82f, 17f)
                moveTo(24f, 17f)
                lineTo(18.5f, 14f)
                lineTo(13f, 17f)
                lineTo(18.5f, 20f)
                lineTo(24f, 17f)
                moveTo(15f, 19.09f)
                verticalLineTo(21.09f)
                lineTo(18.5f, 23f)
                lineTo(22f, 21.09f)
                verticalLineTo(19.09f)
                lineTo(18.5f, 21f)
                lineTo(15f, 19.09f)
                close()
            }
        }.build()

        return _BookEducation!!
    }

@Suppress("ObjectPropertyName")
private var _BookEducation: ImageVector? = null
