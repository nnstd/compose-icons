package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookSettings: ImageVector
    get() {
        if (_BookSettings != null) {
            return _BookSettings!!
        }
        _BookSettings = ImageVector.Builder(
            name = "BookSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                verticalLineTo(18f)
                curveTo(20f, 19.11f, 19.11f, 20f, 18f, 20f)
                horizontalLineTo(6f)
                curveTo(4.89f, 20f, 4f, 19.11f, 4f, 18f)
                verticalLineTo(2f)
                curveTo(4f, 0.895f, 4.89f, 0f, 6f, 0f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                lineTo(9.5f, 5.5f)
                lineTo(12f, 7f)
                verticalLineTo(0f)
                horizontalLineTo(18f)
                curveTo(19.1f, 0f, 20f, 0.89f, 20f, 2f)
                moveTo(7f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
                moveTo(15f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                moveTo(11f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                close()
            }
        }.build()

        return _BookSettings!!
    }

@Suppress("ObjectPropertyName")
private var _BookSettings: ImageVector? = null
