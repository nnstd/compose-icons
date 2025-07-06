package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProjectorScreenVariantOutline: ImageVector
    get() {
        if (_ProjectorScreenVariantOutline != null) {
            return _ProjectorScreenVariantOutline!!
        }
        _ProjectorScreenVariantOutline = ImageVector.Builder(
            name = "ProjectorScreenVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineTo(4f)
                curveTo(3.45f, 6f, 3f, 6.45f, 3f, 7f)
                verticalLineTo(8f)
                curveTo(3f, 8.55f, 3.45f, 9f, 4f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                curveTo(20.55f, 9f, 21f, 8.55f, 21f, 8f)
                verticalLineTo(7f)
                curveTo(21f, 6.45f, 20.55f, 6f, 20f, 6f)
                moveTo(17f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ProjectorScreenVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ProjectorScreenVariantOutline: ImageVector? = null
