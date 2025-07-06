package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextShadow: ImageVector
    get() {
        if (_TextShadow != null) {
            return _TextShadow!!
        }
        _TextShadow = ImageVector.Builder(
            name = "TextShadow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(12f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                moveTo(15f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                moveTo(18f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                moveTo(12f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                moveTo(12f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                moveTo(12f, 16f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                moveTo(12f, 19f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _TextShadow!!
    }

@Suppress("ObjectPropertyName")
private var _TextShadow: ImageVector? = null
