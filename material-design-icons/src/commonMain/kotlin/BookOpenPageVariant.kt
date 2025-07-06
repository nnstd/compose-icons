package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookOpenPageVariant: ImageVector
    get() {
        if (_BookOpenPageVariant != null) {
            return _BookOpenPageVariant!!
        }
        _BookOpenPageVariant = ImageVector.Builder(
            name = "BookOpenPageVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                lineTo(14f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(19f, 13f)
                verticalLineTo(2f)
                moveTo(6.5f, 5f)
                curveTo(4.55f, 5f, 2.45f, 5.4f, 1f, 6.5f)
                verticalLineTo(21.16f)
                curveTo(1f, 21.41f, 1.25f, 21.66f, 1.5f, 21.66f)
                curveTo(1.6f, 21.66f, 1.65f, 21.59f, 1.75f, 21.59f)
                curveTo(3.1f, 20.94f, 5.05f, 20.5f, 6.5f, 20.5f)
                curveTo(8.45f, 20.5f, 10.55f, 20.9f, 12f, 22f)
                curveTo(13.35f, 21.15f, 15.8f, 20.5f, 17.5f, 20.5f)
                curveTo(19.15f, 20.5f, 20.85f, 20.81f, 22.25f, 21.56f)
                curveTo(22.35f, 21.61f, 22.4f, 21.59f, 22.5f, 21.59f)
                curveTo(22.75f, 21.59f, 23f, 21.34f, 23f, 21.09f)
                verticalLineTo(6.5f)
                curveTo(22.4f, 6.05f, 21.75f, 5.75f, 21f, 5.5f)
                verticalLineTo(19f)
                curveTo(19.9f, 18.65f, 18.7f, 18.5f, 17.5f, 18.5f)
                curveTo(15.8f, 18.5f, 13.35f, 19.15f, 12f, 20f)
                verticalLineTo(6.5f)
                curveTo(10.55f, 5.4f, 8.45f, 5f, 6.5f, 5f)
                close()
            }
        }.build()

        return _BookOpenPageVariant!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpenPageVariant: ImageVector? = null
