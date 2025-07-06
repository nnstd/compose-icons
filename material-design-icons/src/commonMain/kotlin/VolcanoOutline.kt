package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VolcanoOutline: ImageVector
    get() {
        if (_VolcanoOutline != null) {
            return _VolcanoOutline!!
        }
        _VolcanoOutline = ImageVector.Builder(
            name = "VolcanoOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8f)
                horizontalLineTo(11f)
                lineTo(9f, 13f)
                horizontalLineTo(6f)
                lineTo(2f, 22f)
                horizontalLineTo(22f)
                lineTo(18f, 8f)
                moveTo(7.3f, 15f)
                horizontalLineTo(10.35f)
                lineTo(10.85f, 13.74f)
                lineTo(12.35f, 10f)
                horizontalLineTo(16.5f)
                lineTo(19.35f, 20f)
                horizontalLineTo(5.08f)
                lineTo(7.3f, 15f)
                moveTo(13f, 1f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                moveTo(16.12f, 5.47f)
                lineTo(18.95f, 2.64f)
                lineTo(20.36f, 4.05f)
                lineTo(17.54f, 6.88f)
                lineTo(16.12f, 5.47f)
                moveTo(7.64f, 4.05f)
                lineTo(9.05f, 2.64f)
                lineTo(11.88f, 5.46f)
                lineTo(10.47f, 6.88f)
                lineTo(7.64f, 4.05f)
                close()
            }
        }.build()

        return _VolcanoOutline!!
    }

@Suppress("ObjectPropertyName")
private var _VolcanoOutline: ImageVector? = null
