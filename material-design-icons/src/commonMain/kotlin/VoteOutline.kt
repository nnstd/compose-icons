package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VoteOutline: ImageVector
    get() {
        if (_VoteOutline != null) {
            return _VoteOutline!!
        }
        _VoteOutline = ImageVector.Builder(
            name = "VoteOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 13f)
                lineTo(21f, 16f)
                verticalLineTo(20f)
                curveTo(21f, 21.11f, 20.1f, 22f, 19f, 22f)
                horizontalLineTo(5f)
                curveTo(3.89f, 22f, 3f, 21.1f, 3f, 20f)
                verticalLineTo(16f)
                lineTo(6f, 13f)
                horizontalLineTo(6.83f)
                lineTo(8.83f, 15f)
                horizontalLineTo(6.78f)
                lineTo(5f, 17f)
                horizontalLineTo(19f)
                lineTo(17.23f, 15f)
                horizontalLineTo(15.32f)
                lineTo(17.32f, 13f)
                horizontalLineTo(18f)
                moveTo(19f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                moveTo(11.34f, 15f)
                lineTo(6.39f, 10.07f)
                curveTo(6f, 9.68f, 6f, 9.05f, 6.39f, 8.66f)
                lineTo(12.76f, 2.29f)
                curveTo(13.15f, 1.9f, 13.78f, 1.9f, 14.16f, 2.3f)
                lineTo(19.11f, 7.25f)
                curveTo(19.5f, 7.64f, 19.5f, 8.27f, 19.11f, 8.66f)
                lineTo(12.75f, 15f)
                curveTo(12.36f, 15.41f, 11.73f, 15.41f, 11.34f, 15f)
                moveTo(13.46f, 4.41f)
                lineTo(8.5f, 9.36f)
                lineTo(12.05f, 12.9f)
                lineTo(17f, 7.95f)
                lineTo(13.46f, 4.41f)
                close()
            }
        }.build()

        return _VoteOutline!!
    }

@Suppress("ObjectPropertyName")
private var _VoteOutline: ImageVector? = null
