package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookEditOutline: ImageVector
    get() {
        if (_BookEditOutline != null) {
            return _BookEditOutline!!
        }
        _BookEditOutline = ImageVector.Builder(
            name = "BookEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.11f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(18f)
                curveTo(19.11f, 2f, 20f, 2.9f, 20f, 4f)
                verticalLineTo(10.3f)
                curveTo(19.78f, 10.42f, 19.57f, 10.56f, 19.39f, 10.74f)
                lineTo(18f, 12.13f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                lineTo(10.5f, 9.75f)
                lineTo(8f, 12f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                moveTo(22.85f, 13.47f)
                lineTo(21.53f, 12.15f)
                curveTo(21.33f, 11.95f, 21f, 11.95f, 20.81f, 12.15f)
                lineTo(19.83f, 13.13f)
                lineTo(21.87f, 15.17f)
                lineTo(22.85f, 14.19f)
                curveTo(23.05f, 14f, 23.05f, 13.67f, 22.85f, 13.47f)
                moveTo(13f, 19.96f)
                verticalLineTo(22f)
                horizontalLineTo(15.04f)
                lineTo(21.17f, 15.88f)
                lineTo(19.13f, 13.83f)
                lineTo(13f, 19.96f)
                close()
            }
        }.build()

        return _BookEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookEditOutline: ImageVector? = null
