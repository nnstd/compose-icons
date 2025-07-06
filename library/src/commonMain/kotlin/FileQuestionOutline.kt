package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileQuestionOutline: ImageVector
    get() {
        if (_FileQuestionOutline != null) {
            return _FileQuestionOutline!!
        }
        _FileQuestionOutline = ImageVector.Builder(
            name = "FileQuestionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(15f, 13f)
                curveTo(15f, 14.89f, 12.75f, 15.07f, 12.75f, 16.76f)
                horizontalLineTo(11.25f)
                curveTo(11.25f, 14.32f, 13.5f, 14.5f, 13.5f, 13f)
                curveTo(13.5f, 12.18f, 12.83f, 11.5f, 12f, 11.5f)
                reflectiveCurveTo(10.5f, 12.18f, 10.5f, 13f)
                horizontalLineTo(9f)
                curveTo(9f, 11.35f, 10.34f, 10f, 12f, 10f)
                reflectiveCurveTo(15f, 11.35f, 15f, 13f)
                moveTo(12.75f, 17.5f)
                verticalLineTo(19f)
                horizontalLineTo(11.25f)
                verticalLineTo(17.5f)
                horizontalLineTo(12.75f)
                close()
            }
        }.build()

        return _FileQuestionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileQuestionOutline: ImageVector? = null
