package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClipboardEdit: ImageVector
    get() {
        if (_ClipboardEdit != null) {
            return _ClipboardEdit!!
        }
        _ClipboardEdit = ImageVector.Builder(
            name = "ClipboardEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.04f, 12.13f)
                curveTo(21.18f, 12.13f, 21.31f, 12.19f, 21.42f, 12.3f)
                lineTo(22.7f, 13.58f)
                curveTo(22.92f, 13.79f, 22.92f, 14.14f, 22.7f, 14.35f)
                lineTo(21.7f, 15.35f)
                lineTo(19.65f, 13.3f)
                lineTo(20.65f, 12.3f)
                curveTo(20.76f, 12.19f, 20.9f, 12.13f, 21.04f, 12.13f)
                moveTo(19.07f, 13.88f)
                lineTo(21.12f, 15.93f)
                lineTo(15.06f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(19.94f)
                lineTo(19.07f, 13.88f)
                moveTo(19f, 3f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(9f)
                lineTo(11f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(9.18f)
                curveTo(9.6f, 1.84f, 10.7f, 1f, 12f, 1f)
                curveTo(13.3f, 1f, 14.4f, 1.84f, 14.82f, 3f)
                horizontalLineTo(19f)
                moveTo(12f, 3f)
                curveTo(11.45f, 3f, 11f, 3.45f, 11f, 4f)
                curveTo(11f, 4.55f, 11.45f, 5f, 12f, 5f)
                curveTo(12.55f, 5f, 13f, 4.55f, 13f, 4f)
                curveTo(13f, 3.45f, 12.55f, 3f, 12f, 3f)
                close()
            }
        }.build()

        return _ClipboardEdit!!
    }

@Suppress("ObjectPropertyName")
private var _ClipboardEdit: ImageVector? = null
