package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ProjectorScreenVariantOffOutline: ImageVector
    get() {
        if (_ProjectorScreenVariantOffOutline != null) {
            return _ProjectorScreenVariantOffOutline!!
        }
        _ProjectorScreenVariantOffOutline = ImageVector.Builder(
            name = "ProjectorScreenVariantOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4.11f, 6f)
                horizontalLineTo(4f)
                curveTo(3.45f, 6f, 3f, 6.45f, 3f, 7f)
                verticalLineTo(8f)
                curveTo(3f, 8.55f, 3.45f, 9f, 4f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(16.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(7f, 16f)
                verticalLineTo(9f)
                horizontalLineTo(7.11f)
                lineTo(14.11f, 16f)
                horizontalLineTo(7f)
                moveTo(12.2f, 9f)
                lineTo(9.2f, 6f)
                horizontalLineTo(20f)
                curveTo(20.55f, 6f, 21f, 6.45f, 21f, 7f)
                verticalLineTo(8f)
                curveTo(21f, 8.55f, 20.55f, 9f, 20f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(15.8f)
                lineTo(17f, 13.8f)
                verticalLineTo(9f)
                horizontalLineTo(12.2f)
                close()
            }
        }.build()

        return _ProjectorScreenVariantOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ProjectorScreenVariantOffOutline: ImageVector? = null
