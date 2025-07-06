package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookOpenBlankVariant: ImageVector
    get() {
        if (_BookOpenBlankVariant != null) {
            return _BookOpenBlankVariant!!
        }
        _BookOpenBlankVariant = ImageVector.Builder(
            name = "BookOpenBlankVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 20f)
                curveTo(8.2f, 20f, 10.65f, 20.65f, 12f, 21.5f)
                curveTo(13.35f, 20.65f, 15.8f, 20f, 17.5f, 20f)
                curveTo(19.15f, 20f, 20.85f, 20.3f, 22.25f, 21.05f)
                curveTo(22.35f, 21.1f, 22.4f, 21.1f, 22.5f, 21.1f)
                curveTo(22.75f, 21.1f, 23f, 20.85f, 23f, 20.6f)
                verticalLineTo(6f)
                curveTo(22.4f, 5.55f, 21.75f, 5.25f, 21f, 5f)
                curveTo(19.89f, 4.65f, 18.67f, 4.5f, 17.5f, 4.5f)
                curveTo(15.55f, 4.5f, 13.45f, 4.9f, 12f, 6f)
                curveTo(10.55f, 4.9f, 8.45f, 4.5f, 6.5f, 4.5f)
                curveTo(5.33f, 4.5f, 4.11f, 4.65f, 3f, 5f)
                curveTo(2.25f, 5.25f, 1.6f, 5.55f, 1f, 6f)
                verticalLineTo(20.6f)
                curveTo(1f, 20.85f, 1.25f, 21.1f, 1.5f, 21.1f)
                curveTo(1.6f, 21.1f, 1.65f, 21.1f, 1.75f, 21.05f)
                curveTo(3.15f, 20.3f, 4.85f, 20f, 6.5f, 20f)
                moveTo(12f, 19.5f)
                verticalLineTo(8f)
                curveTo(13.35f, 7.15f, 15.8f, 6.5f, 17.5f, 6.5f)
                curveTo(18.7f, 6.5f, 19.9f, 6.65f, 21f, 7f)
                verticalLineTo(18.5f)
                curveTo(19.9f, 18.15f, 18.7f, 18f, 17.5f, 18f)
                curveTo(15.8f, 18f, 13.35f, 18.65f, 12f, 19.5f)
                close()
            }
        }.build()

        return _BookOpenBlankVariant!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpenBlankVariant: ImageVector? = null
