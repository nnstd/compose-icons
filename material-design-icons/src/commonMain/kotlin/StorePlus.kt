package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StorePlus: ImageVector
    get() {
        if (_StorePlus != null) {
            return _StorePlus!!
        }
        _StorePlus = ImageVector.Builder(
            name = "StorePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                moveTo(4f, 7f)
                lineTo(3f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                curveTo(12.95f, 19.66f, 12.92f, 19.31f, 12.92f, 18.95f)
                curveTo(12.92f, 17.73f, 13.3f, 16.53f, 14f, 15.53f)
                verticalLineTo(14f)
                horizontalLineTo(15.54f)
                curveTo(16.54f, 13.33f, 17.71f, 12.96f, 18.91f, 12.96f)
                curveTo(19.62f, 12.96f, 20.33f, 13.09f, 21f, 13.34f)
                verticalLineTo(12f)
                lineTo(20f, 7f)
                moveTo(6f, 14f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                moveTo(18f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
            }
        }.build()

        return _StorePlus!!
    }

@Suppress("ObjectPropertyName")
private var _StorePlus: ImageVector? = null
