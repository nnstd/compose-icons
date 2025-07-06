package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeExportOutline: ImageVector
    get() {
        if (_HomeExportOutline != null) {
            return _HomeExportOutline!!
        }
        _HomeExportOutline = ImageVector.Builder(
            name = "HomeExportOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                lineTo(20f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                lineTo(24f, 13f)
                moveTo(4f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(1f)
                lineTo(11f, 3f)
                lineTo(18f, 9.3f)
                verticalLineTo(10f)
                horizontalLineTo(15.79f)
                lineTo(11f, 5.69f)
                lineTo(6f, 10.19f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _HomeExportOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeExportOutline: ImageVector? = null
