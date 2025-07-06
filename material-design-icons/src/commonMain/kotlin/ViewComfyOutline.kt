package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewComfyOutline: ImageVector
    get() {
        if (_ViewComfyOutline != null) {
            return _ViewComfyOutline!!
        }
        _ViewComfyOutline = ImageVector.Builder(
            name = "ViewComfyOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                moveTo(20f, 9f)
                horizontalLineTo(17.75f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                moveTo(9.25f, 11f)
                horizontalLineTo(11.5f)
                verticalLineTo(13f)
                horizontalLineTo(9.25f)
                verticalLineTo(11f)
                moveTo(7.25f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(7.25f)
                verticalLineTo(13f)
                moveTo(11.5f, 9f)
                horizontalLineTo(9.25f)
                verticalLineTo(7f)
                horizontalLineTo(11.5f)
                verticalLineTo(9f)
                moveTo(13.5f, 7f)
                horizontalLineTo(15.75f)
                verticalLineTo(9f)
                horizontalLineTo(13.5f)
                verticalLineTo(7f)
                moveTo(11.5f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(9.25f)
                verticalLineTo(15f)
                horizontalLineTo(11.5f)
                moveTo(13.5f, 15f)
                horizontalLineTo(15.75f)
                verticalLineTo(17f)
                horizontalLineTo(13.5f)
                verticalLineTo(15f)
                moveTo(13.5f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(15.75f)
                verticalLineTo(13f)
                horizontalLineTo(13.5f)
                moveTo(17.75f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(17.75f)
                verticalLineTo(11f)
                moveTo(7.25f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(7.25f)
                moveTo(5f, 15f)
                horizontalLineTo(7.25f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                moveTo(17.75f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(17.75f)
                close()
            }
        }.build()

        return _ViewComfyOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewComfyOutline: ImageVector? = null
